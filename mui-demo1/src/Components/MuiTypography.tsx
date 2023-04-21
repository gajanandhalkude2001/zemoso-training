import { Typography } from "@mui/material";
import React from 'react'

function MuiTypography() {
  return (
    <div>
        <Typography variant="h1">h1 Heading</Typography>
        <Typography variant="h2">h2 Heading</Typography>
        <Typography variant="h3">h3 Heading</Typography>
        <Typography variant="h4">h4 Heading</Typography>
        <Typography variant="h5">h5 Heading</Typography>
        <Typography variant="h6">h6 Heading</Typography>

        <Typography variant="subtitle1">Sub Title-1</Typography>
        <Typography variant="subtitle2">Sub Title-2</Typography>

        <Typography variant="body1">Fontsource can be configured to load specific subsets, weights and styles. Material UI's default typography configuration relies only on the 300, 400, 500, and 700 font weights.</Typography>
        <Typography variant="body2">Fontsource can be configured to load specific subsets, weights and styles. Material UI's default typography configuration relies only on the 300, 400, 500, and 700 font weights.</Typography><br/> <hr/>
    </div>
  )
}

export default MuiTypography