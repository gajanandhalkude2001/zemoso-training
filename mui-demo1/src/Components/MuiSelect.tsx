import React from 'react'
import {Box} from '@mui/material'
import TextField from '@mui/material/TextField'
import MenuItem from '@mui/material/MenuItem';
import {useState} from 'react';

function MuiSelect() {
    const [Language , setLanguage] = useState<string[]>([]);
    console.log(Language);
    const handleChange = (e:any)=>setLanguage(e.target.value as string[])
  return (
    <div style={{width:'200px'}}>
        <TextField label='Select language' select fullWidth value={Language} onChange={handleChange}
          SelectProps= {{  multiple:true  }}>
          <MenuItem value='Te'>Telugu</MenuItem>
          <MenuItem value='Hi'>Hindi</MenuItem>
          <MenuItem value='Ma'>Marathi</MenuItem>
          <MenuItem value='Kan'>Kannada</MenuItem>
        </TextField>
    </div>
  )
}

export default MuiSelect