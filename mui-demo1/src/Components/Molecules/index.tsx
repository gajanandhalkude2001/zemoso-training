import {useState} from 'react';
import { Stack, Card, Divider } from "@mui/material";
import { ButtonComponent } from "../Atoms/Button";
import TextFieldComponent from "../Atoms/TextField";
import IconComponent from "../Atoms/IconButton";
import ClearIcon from "@mui/icons-material/Clear";
import TypographyComponent from "../Atoms/Typography";
import { styled } from "@mui/material";
import SliderComponent from '../Atoms/Slider';
import React from 'react';

const StyledCard = styled(Card)({
  width: "650px",
  backgroundColor: "lightgrey",
  margin: "5% 10% 5% 10%"
});

const StyledStack1 = styled(Stack)({
  width: '640px',
  height: '113px',
  padding: '24px 40px 24px 40px',
})

const StyledStack3 = styled(Stack)({
  width: '640px',
  height: '116px',
  top: '247px',
  padding: '32px 40px 32px 40px',
  color: '#262529',
  gap: '8px',
})

function Molecule() {

  const [val , setvalue] = useState<string>('');
  
  const handleChange = (event: React.ChangeEvent<HTMLInputElement>) =>{
    setvalue(event.target.value)
    console.log(val);
  }

  return (
    <>
      <StyledCard>
        <Stack direction="row" divider={<Divider orientation='vertical' flexItem />}>
          <StyledStack1>
            <TypographyComponent variant="h4" width='520px' height='34px' lineHeight='34.3px' color='#E8E7F0'>
              Name your cash Kick
            </TypographyComponent>
            <TypographyComponent variant="h5" width='520px' top='38px' color='#A5A5A6'>
              Add a name to identify your Cash Kick
            </TypographyComponent>
          </StyledStack1>
          <IconComponent>
            <ClearIcon />
          </IconComponent>
        </Stack>
        <Stack spacing={1}>
          <TypographyComponent>Cash Kick Name</TypographyComponent>
          <TextFieldComponent value={val} placeholder="My first Advance" onChange={handleChange}></TextFieldComponent>
          <p>{val}</p>
        </Stack>
        <StyledStack3 direction="row" spacing={1}  >
          <ButtonComponent title="Button" onClick={ ()=>{ console.log('Cancel Clicked') }}>Cancel</ButtonComponent>
          <ButtonComponent title="Button" onClick={ ()=>{ console.log('Cash clicked') }}>Create Cash Kick</ButtonComponent>
        </StyledStack3>
      </StyledCard>
    </>
  );
}

export default Molecule;
