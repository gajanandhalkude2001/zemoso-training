import React from 'react'
import {Grid,Paper, Box,Card,CardActions,CardContent,CardMedia,Typography,Button,ButtonGroup,colors, CardHeader, TextField,Stack} from '@mui/material';
import ClearIcon from '@mui/icons-material/Clear';
import { display } from '@mui/system';

function Ex() {
  return (
<Paper sx={{width:'650px', height:'116px', padding:'32px, 40px, 24px, 40px',gap:'8px', backgroundColor:'#262529' }}>
    <Grid container sx={{ bgcolor:'lightgrey', display:'block', justifycontent:'center', spacing:'4'}}  >
        <Grid item display='block' xs={12} sm={6} md={3}>
                <Stack>
                    <Typography variant='subtitle1'> Name Your Cash Kick  </Typography>
                    <Typography variant='subtitle2'>Add a name to identify your Cash Kick  </Typography>
                </Stack>

                <Stack>
                    <ClearIcon/>
                </Stack>
        </Grid>

        <Grid item xs={12} sm={6} md={3}>
        <TextField variant='filled' placeholder='Ex: marketing expences' label='Cash kick name' fullWidth/>
        </Grid>

        <Grid item xs={12} sm={6} md={3}  sx={{padding:'32px ,40px ,24px ,40px', width:'640px' ,top:'247px' , gap:'8px',height:'116px', border:'1px #413F4D'}}>
        <ButtonGroup component='div' variant='contained' orientation='horizontal' fullWidth>
                <Button  style={{color:'grey',backgroundColor: '#2D2D30' , width:'133px' ,height:'60px' ,top:'32px',left:'251px',borderRadius:'12px',padding:'20px,40px,20px,40px',gap:'8px' }} >Cancel</Button>
                <Button variant='contained' style={{color:'white',backgroundColor: 'primary' , width:'208px' ,height:'60px' ,top:'32px',left:'259px',borderRadius:'12px',padding:'20px,40px,20px,40px',gap:'8px' }}  >Create Cash Kick</Button>
                </ButtonGroup>
        </Grid>
    </Grid>
</Paper>
  )
}

export default Ex