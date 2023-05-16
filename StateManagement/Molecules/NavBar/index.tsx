import { styled, } from '@mui/material'
import ButtonComponent from "../../Atoms/Button";
import IconButtonComponent from "../../Atoms/IconButton";
import TypographyComponent from "../../Atoms/Typography";
import React,{ReactEventHandler, useState} from 'react'
import { Stack, Grid } from '@mui/material';
import HomeBarComponent from '../HomeBar';
import index from '../../Organisms/Back/index.js';


// interface Props {
//     onClick:ReactEventHandler,
// }

const NavBarComponent = () =>
{
    const [contacts,setContacts] = useState(false);
    const handleClick = ()=>(
        setContacts(true)  
    )
  

    return(
    <Grid container flexGrow={1} border='2px solid #28272B'>
        <Stack direction='row'  spacing={70}>
            <Stack>
                <Stack spacing={2}>
                    <Stack spacing={0}>
                        <TypographyComponent variant='h6'>New Cash Kick</TypographyComponent>
                        <TypographyComponent variant='subtitle1'>Let's setup a new cash kick to power your saas</TypographyComponent>
                    </Stack>
                    <Stack>
                        <TypographyComponent > <IconButtonComponent onClick={ handleClick  }> <img src='asset/button.svg' alt='Back'></img></IconButtonComponent></TypographyComponent>
                    </Stack>
                </Stack>
            </Stack>
            <Stack alignItems='flex-start' justifyContent='flex-start'>
                <TypographyComponent><IconButtonComponent><img src='asset/avatar+icon.svg' alt='profile' ></img> </IconButtonComponent> </TypographyComponent>
            </Stack>
        </Stack>
    </Grid>
    )
}
export default NavBarComponent



// onClick={props.onClick}