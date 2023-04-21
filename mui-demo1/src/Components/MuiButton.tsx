import {Button,Stack,IconButton, TextField, InputAdornment} from '@mui/material';
import ContactsIcon from '@mui/icons-material/Contacts';
import React from 'react'
import ButtonGroup from '@mui/material/ButtonGroup';
import { Password } from '@mui/icons-material';

function MuiButton() {
  return (
    <div>
       <Stack spacing={4}>
        <Stack spacing={3} direction='row'>
            <Button variant='text'>Text</Button>
            <Button variant='contained'>Contained</Button>
            <Button variant='outlined'>Outlined</Button>
            </Stack>
        <Stack spacing={2}  direction='row'>
            <Button variant='text' color='primary'>primary</Button>
            <Button variant='text' color='secondary'>secondary</Button>
            <Button variant='contained' color='error'>error</Button>
            <Button variant='contained' color='warning'>warning</Button>
            <Button variant='outlined' color='info'>info</Button>
            <Button variant='outlined' color='success'>success</Button>
            </Stack>
        <Stack spacing={4} direction='row'>
            <Button variant='contained' color='info' size='small'>Small</Button>
            <Button variant='contained' color='success' size='medium'>Medium</Button>
            <Button variant='contained' color='secondary' size='large'>Large</Button>
            </Stack>
        <Stack spacing={3} direction='row'>
            <Button variant='contained' size='small' color='success' startIcon= {<ContactsIcon/>} disableElevation disableRipple onClick={()=>console.log("clicked")}>Contacts</Button>
            <Button variant='contained' size='small' color='primary' endIcon= {<ContactsIcon/>} >Contacts</Button>
            <IconButton aria-label='contacts' size='small' color='error' >
                <ContactsIcon/>
            </IconButton>
            </Stack>
        <Stack direction='row'>
        <ButtonGroup variant='contained' color='info' orientation='vertical' >
            <Button onClick={()=>alert("left clicked")}>left</Button>
            <Button >center</Button>
            <Button >right</Button>
        </ButtonGroup>
        </Stack>
        <Stack direction='row' spacing={3}>
            <TextField label="username" helperText='please enter ur name here' required/>
            <TextField label='password' type='Password' variant='filled'/>
            <TextField label='medium-secondary' size='medium' color='secondary'/>
        </Stack>
        <Stack direction='row' spacing={3}>
            <TextField label='Amount' InputProps={ {
                startAdornment:<InputAdornment position='start'>$</InputAdornment>,
            }
             }/>
             <TextField label='Water' InputProps={ {
                endAdornment:<InputAdornment position='end'>ltr</InputAdornment>,
            }
        }/>
        </Stack>
    </Stack> <br/> <hr/>
    </div>
  )
}

export default MuiButton