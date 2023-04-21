import react from 'react';

import {Button,ButtonProps} from '@mui/material';

interface PropTypes extends ButtonProps {
  children:React.ReactNode,
  
}

export const ButtonComponent = (props:PropTypes)=> (
  <Button color={props.color} variant={props.variant} onClick={props.onClick}> {props.children} </Button>
)