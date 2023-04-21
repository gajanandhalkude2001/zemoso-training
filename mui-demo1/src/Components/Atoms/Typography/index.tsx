import { Typography, TypographyProps } from '@mui/material';

function TypographyComponent(props: TypographyProps) {
  return (
    <div>
      <Typography variant={props.variant}> {props.children}  </Typography>
    </div>
  )
}

export default TypographyComponent