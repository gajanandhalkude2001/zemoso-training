import { IconProps } from "@mui/material"

interface Props extends IconProps {
    src:string,
    alt:string,
}
const IconComponent = (props:Props)=>
(
    <div>
        <img src={props.src} alt={props.src}></img>
    </div>
)
export default IconComponent