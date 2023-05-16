import { Slider, SliderProps } from "@mui/material";

const SliderComponent = (props: SliderProps) => (
  <Slider
    defaultValue={props.defaultValue}
    size={props.size}
    color={props.color}
    onChange={props.onChange}
    max={props.max}
    min={props.min}
    value={props.value}
  />
);
export default SliderComponent;
