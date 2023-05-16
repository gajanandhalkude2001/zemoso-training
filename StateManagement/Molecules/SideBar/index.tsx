import { styled, } from '@mui/material'
import ButtonComponent from "../../Atoms/Button";
import IconButtonComponent from "../../Atoms/IconButton";
import TypographyComponent from "../../Atoms/Typography";
import React, {ReactEventHandler, useState} from 'react';

import { AppBar, Toolbar, Stack,InputAdornment,Grid } from '@mui/material';

import NewCashKickComponent from '../../Organisms/NewCashKick';
import { useNavigate } from 'react-router-dom';

interface Props {
    onClick:ReactEventHandler,
}

const StyledStack = styled(Stack)({
    width:'15em',
    backgroundColor: '#201F24',
    color: '#E8E7F0',
    height: '100vh',
    justifyContent: 'flex-start',
})

// const StyledButtonComponent = styled(ButtonComponent)({
//     color:'#2D2D30',
//     backgroundColor:'white',
// })

const SideBarComponent = (props:Props) =>
{     
        return(
            <StyledStack spacing={40}>
                <Stack spacing={4}>

                    <Stack direction='row'>
                        <TypographyComponent variant="h6"><IconButtonComponent>  <img src='asset/Group.svg' alt='pic'></img>  </IconButtonComponent>Seeder</TypographyComponent>
                    </Stack>

                    <Stack spacing={2}>
                        <Stack direction='row'>
                        <TypographyComponent onClick={ props.onClick } variant="body1">  <IconButtonComponent><img src='asset/home-2.svg' alt='pic'></img></IconButtonComponent>     Home     </TypographyComponent>
                        </Stack>

                        <Stack direction='row'>
                        <TypographyComponent onClick={ props.onClick } variant="body1">  <IconButtonComponent> <img src='asset/coin.png' alt='pic'></img></IconButtonComponent>     Cash Acceleration     </TypographyComponent>
                        {/* <StyledButtonComponent variant='contained' sx={{backgroundColor:'#2D2D30'}}> <IconButtonComponent>  <img src='asset/coin.png' alt='pic'></img>  </IconButtonComponent>Cash Acceleration </StyledButtonComponent> */}
                        </Stack>
                    </Stack>

                </Stack>

                <Stack direction='row'>
                    <TypographyComponent variant='subtitle1'><IconButtonComponent>  <img src='asset/flash.png' alt='pic'></img>  </IconButtonComponent>Watch how to</TypographyComponent>
                </Stack>

            </StyledStack>
        )

   
}
export default SideBarComponent
export { }

















































// const StyledAppBar = styled(AppBar)({
//     width: '30%',
//     height: '100vh',
//     justifyContent: 'flex-start',
//     backgroundColor: '#201F24',
//     color: '#E8E7F0',

// })

// const StyledToolbar = styled(Toolbar)({
//     display: 'flex',
//     width: '100%',
//     height:'80%',
//     justifyContent: 'flex-start',

// })











{/* <StyledAppBar position='static'>
        <StyledToolbar>

        </StyledToolbar> */}