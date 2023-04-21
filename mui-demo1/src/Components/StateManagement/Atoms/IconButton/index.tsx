import { IconButton, IconButtonProps} from "@mui/material";

interface Props extends IconButtonProps {
    src?:string,
    alt?:string,
    startIcon?:React.ReactNode,
}

const IconButtonComponent = (props:Props) => 
(
    <IconButton >
        {props.children}
    </IconButton>
)
export default IconButtonComponent