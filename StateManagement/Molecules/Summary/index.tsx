
import { Button, Stack } from '@mui/material'
import ButtonComponent from "../../Atoms/Button";
import IconButtonComponent from "../../Atoms/IconButton";
import SliderComponent from '../../Atoms/Slider';
import TypographyComponent from "../../Atoms/Typography";
import { useState } from 'react';
import React from 'react';


interface Props {
    total:number,
    count:number,
    getTotal:(tot:number,cou:number) => void;

}

const SummaryComponent = (props:Props) =>
{
    const [Value, setValue] = useState<number>(props.total);
    

    // const handleChange = (event:any)=>(
    //     setValue( event.target.value  )
    // )
        const Rate = (props.total)*(12/100);
        const Total = (props.total) - Rate;

    const showTotal = () => {
            console.log(`Your Total is ${Total}`);
            window.alert(`Your Total is ${Total}`);
    };

    return (
    <Stack flexGrow={1} gap={1} >
        <Stack >
            <TypographyComponent>
                Summary
                <IconButtonComponent><img src='asset/info-circle.svg' alt='infoCi'></img> </IconButtonComponent>
            </TypographyComponent>
        </Stack>

        <Stack spacing={2} >
            <Stack direction='row' justifyContent={'space-between'}>
                <TypographyComponent>Term</TypographyComponent>
                <TypographyComponent>12 Months</TypographyComponent></Stack>
            <Stack direction='row' justifyContent={'space-between'}> 
                <TypographyComponent>Selected contracts</TypographyComponent> 
                <TypographyComponent>{props.count}</TypographyComponent></Stack>
        </Stack>

        <Stack spacing={2} >
            <Stack direction='row' justifyContent={'space-between'}> 
                <TypographyComponent>Slide to autoselect
                </TypographyComponent> 
                <TypographyComponent onClick={(event: React.MouseEvent<HTMLDivElement>) => props.getTotal(0, 0)}> 
                    <IconButtonComponent> <img src='asset/Resetbutton.svg' alt='Reset'></img> </IconButtonComponent>
                </TypographyComponent>
            </Stack>
            <Stack> 
            
                      <SliderComponent value={props.total} max={880000} min={0}  defaultValue={0}/>  
                      {/* onChange={handleChange} */}
               
                <TypographyComponent>{props.total} Selected of $882000</TypographyComponent>
            </Stack>
        </Stack>

        <Stack spacing={0}>
            <Stack direction='row' justifyContent={'space-between'}> 
            <TypographyComponent>Pay Back Amount</TypographyComponent>
            <TypographyComponent>{props.total}</TypographyComponent></Stack>

            <Stack direction='row' justifyContent={'space-between'}> 
            <TypographyComponent>Rate %</TypographyComponent> 
            <TypographyComponent>{Rate}</TypographyComponent></Stack>
        </Stack>

        <Stack spacing={2}>
            <Stack direction='row' justifyContent={'space-between'}>
                <TypographyComponent>Total Payout</TypographyComponent>
                <TypographyComponent>{Total}</TypographyComponent>
            </Stack>
            <Stack>
                <Button variant='contained'  onClick={showTotal}>Review Your Credit</Button>
            </Stack>
        </Stack>

    </Stack>
    )
}
    

export default SummaryComponent