import { Stack } from '@mui/system'
import {Avatar, AvatarGroup} from '@mui/material'
import React from 'react'

function MuiAvatar() {
  return (
    <Stack>
        <Stack direction='row' >
            <AvatarGroup max={3}>
            <Avatar sx={{bgcolor:'primary.light'}}>GH</Avatar>
            <Avatar sx={{bgcolor:'primary.light'}}>SD</Avatar>
            <Avatar sx={{bgcolor:'primary.light'}}>AB</Avatar>
            <Avatar sx={{bgcolor:'primary.light'}}>CD</Avatar>
            <Avatar sx={{bgcolor:'primary.light'}}>EF</Avatar>
            </AvatarGroup>
        </Stack>
    </Stack>
  )
}

export default MuiAvatar