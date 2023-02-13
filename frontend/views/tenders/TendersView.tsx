import { Grid } from '@hilla/react-components/Grid.js';
import { GridColumn } from '@hilla/react-components/GridColumn.js';
import { GridSortColumn } from '@hilla/react-components/GridSortColumn.js';
import { Button } from '@hilla/react-components/Button.js';
import { Icon } from '@hilla/react-components/Icon.js';
import type TenderDTO from 'Frontend/generated/pl/kskowronski/application/data/entity/inap/TenderDTO';
import { TendersEndpoint } from 'Frontend/generated/endpoints';


import { Notification } from '@hilla/react-components/Notification.js';
import { TextField } from '@hilla/react-components/TextField.js';
import { HelloReactEndpoint } from 'Frontend/generated/endpoints';
import { useEffect, useState } from 'react';

export default function TendersView() {
    const tender: TenderDTO = { id: 1, city: '' };
    const [tenders, setTenders] = useState(Array<TenderDTO | undefined>());

    //https://icomoon.io/app/#/select
    const icons = {
        'car': 'M1024 576l-128-256h-192v-128c0-35.2-28.8-64-64-64h-576c-35.2 0-64 28.8-64 64v512l64 64h81.166c-10.898 18.832-17.166 40.678-17.166 64 0 70.692 57.308 128 128 128s128-57.308 128-128c0-23.322-6.268-45.168-17.166-64h354.334c-10.898 18.832-17.168 40.678-17.168 64 0 70.692 57.308 128 128 128s128-57.308 128-128c0-23.322-6.27-45.168-17.168-64h81.168v-192zM704 576v-192h132.668l96 192h-228.668z',
        'bin2': 'M192 1024h640l64-704h-768zM640 128v-128h-256v128h-320v192l64-64h768l64 64v-192h-320zM576 128h-128v-64h128v64z',
        'trash': 'M192 1024h640l64-704h-768zM640 128v-128h-256v128h-320v192l64-64h768l64 64v-192h-320zM576 128h-128v-64h128v64z',
        'cater': 'M964.73 178.804c-93.902-109.45-233.21-178.804-388.73-178.804-282.77 0-512 229.23-512 512s229.23 512 512 512c155.52 0 294.828-69.356 388.728-178.804l-324.728-333.196 324.73-333.196zM704 120.602c39.432 0 71.398 31.964 71.398 71.398 0 39.432-31.966 71.398-71.398 71.398s-71.398-31.966-71.398-71.398c0-39.432 31.966-71.398 71.398-71.398z'
    };

    useEffect(() => {
        (async () => {
            setTenders(await TendersEndpoint.getAllTendersBeforePlacing("5"));
        })();

        return () => { };
    }, []);

    // @ts-ignore
    function ImgGoal(props) {
        return (
            props.name === "CATER" ? <img className="Avatar" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMhdsZOruGAPsyNQFzkeclrSjM-MAuRdqHig&usqp=CAU"/> :
                <img className="Avatar" src={props.url}  alt={props.name}/>
        );
    }

    return (
        <>
            <section className="flex p-m  h-screen gap-m items-end">
                <Grid items={tenders} className="h-full">
                    <GridColumn header="Typ" width="5px" renderer={({ item }) => {return <ImgGoal name = {item.tenderType}/>;}} />
                    <GridColumn header="Purchaser" renderer={({ item }) => <span title={item.purchaser}>{item.purchaser}</span>} />
                    <GridSortColumn  header="City" path='city' />
                    <GridColumn header="Deadline" path='deadlineApplication' />
                    <GridColumn header="Responsible" path='responsiblePersonFormal' />

                    <GridColumn header="Responsible" path='responsiblePersonFormal' />
                    <GridColumn header="PackNumber" path='packageNumber' width="5px" />
                    <GridColumn header="Priority" path='priority'width="5px" />
                    <GridColumn header="Participate" path='participate' width="5px" />
                </Grid>
            </section>
        </>
    );
}
