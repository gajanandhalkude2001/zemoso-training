import { VolumeDown,VolumeUp } from '@mui/icons-material';
import { Slider,Stack,Typography } from '@mui/material';
import { useState } from 'react';


function MuiSlider() {
  const [val , setVal] = useState<number>(80);

  const changeHandler = (event:any) => {
    setVal(event.target.value);
}

  return (
    <Stack width={300} direction='row'  alignItems='center' justifyContent='space-evenly'>
      <Typography variant='overline'>0</Typography>
        <VolumeDown/>
        <Slider value={val} color='primary'  size='medium' onChange={changeHandler} step={2}/>
        <VolumeUp/>
        <Typography variant='inherit'>{val}</Typography>
    </Stack>
  )
}

export default MuiSlider