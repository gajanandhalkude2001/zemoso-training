import { Typography, TypographyProps } from "@mui/material";

interface Props extends TypographyProps {
    src?:string,
    alt?:string,
}

const TypographyComponent = (props:Props) =>
(
    <Typography onClick={props.onClick} variant={props.variant} color={props.color} >{props.children} </Typography>
)
export default TypographyComponent