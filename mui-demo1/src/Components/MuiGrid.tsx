import React from 'react'
import {Grid} from '@mui/material';

export default function MuiGrid() {
  return (
    <Grid container sx={{border:'1px solid black'}} rowSpacing={2} columnSpacing={4} margin={4}>
        <Grid bgcolor='primary.dark' item xs={12} sm={6} md={3}>Item-1</Grid>
        <Grid bgcolor='primary.light' item xs={12} sm={6} md={3}>Item-2</Grid>
        <Grid bgcolor='primary.light' item xs={12} sm={6} md={3}>Item-3</Grid>
        <Grid bgcolor='primary.dark' item xs={12} sm={6} md={3}>Item-4</Grid>
    </Grid>
  )
}
