import { Button, ButtonProps } from "@mui/material";

const ButtonComponent = (props: ButtonProps) => (
  <Button variant={props.variant} size={props.size} color={props.color}>
    {props.children}
  </Button>
);

export default ButtonComponent;
