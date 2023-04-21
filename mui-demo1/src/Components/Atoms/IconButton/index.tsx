import React from 'react';
import { IconButton,IconButtonProps } from '@mui/material';
import ClearIcon from "@mui/icons-material/Clear";

interface PropsType extends IconButtonProps {
    children:React.ReactNode
    onClick?:React.MouseEventHandler<HTMLButtonElement>
}
const IconComponent = (props:PropsType) =>
        <>
        {props.children}
        </>
    
export default IconComponent


