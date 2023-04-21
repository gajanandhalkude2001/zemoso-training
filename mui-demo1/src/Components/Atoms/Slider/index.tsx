import { Slider,Stack,SliderProps } from "@mui/material";
import React from "react";

function SliderComponent(props:SliderProps) {
  return (

        <Slider color={props.color} onChange={props.onChange} size={props.size} step={props.step} marks={props.marks} > {props.children} </Slider>
  )
}

export default SliderComponent