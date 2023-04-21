import { InputAdornment, TextField, TextFieldProps } from "@mui/material";
import React from 'react'

interface Props{
  variant?:"outlined" | "standard" | "filled" | undefined,
  placeholder?:string,
  onClick?: (event: React.ChangeEvent<HTMLInputElement>) => void,
  label?:string,
  fullWidth?:boolean,
  Icon?:React.ReactNode,
  value:string,
  onChange?:(event: React.ChangeEvent<HTMLInputElement>) => void
}
const TextFieldComponent = (props:Props) => (
  <div>
    <TextField
      value={props.value}
      variant={props.variant}
      placeholder={props.placeholder}
      onChange={props.onChange}
      label={props.label}
      fullWidth={props.fullWidth}
      InputProps={{
        startAdornment: (
          <InputAdornment position="start">
            {props.Icon}
          </InputAdornment>
        ),
        endAdornment: (
          <InputAdornment position="end">
            {props.Icon}
          </InputAdornment>
        ),
      }} 
      
    />
  </div>
);

export default TextFieldComponent;


// const TextFieldComponent = (props:PropsType) => (
//   <div>
//     <TextField
//       variant={props.variant}
//       placeholder={props.placeholder}
//       onClick={props.onClick}
//       label={props.label}
//       fullWidth={props.fullWidth}
//       InputProps={{
//         startAdornment: (
//           <InputAdornment position="start">
//             {props.Icon}
//           </InputAdornment>
//         ),
//       }}
//     />
//   </div>
// );
