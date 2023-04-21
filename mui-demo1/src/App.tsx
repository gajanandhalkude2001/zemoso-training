import './App.css';
import MuiAvatar from './Components/MuiAvatar';
import MuiButton from './Components/MuiButton';
import MuiGrid from './Components/MuiGrid';
import MuiSlider from './Components/MuiSlider';
import MuiSelect from './Components/MuiSelect';
import MuiTypography from './Components/MuiTypography';
import {createTheme} from '@mui/material';
import {colors,ThemeProvider} from '@mui/material';
import { typography } from '@mui/system';

import ParentChild from './Components/ParentChildAssig';
import Ex from './Components/ParentChildAssig/Ex'
import Molecule from './Components/Molecules';
import NewCashKickComponent from './Components/StateManagement/Organisms/NewCashKick';

const theme1 = createTheme({
  palette:{
    primary:{
      main: colors.orange[400]
    }
  },
  typography:{
    h3:{
      fontFamily:'cursive'
    },
    subtitle1:{
      fontWeight:'bolder'
    }
  }
})

const theme2 = createTheme();
theme2.spacing(3)
// theme2.typography.h3:{color:'blue'}
// theme2.palette.secondary.main:{colors.green[500]}

function App() {
  return (
    // <ThemeProvider theme={theme1}>
    <div className="App">
     {/* <MuiTypography/> */}
     {/* <MuiButton/> */}
     {/* <MuiSelect/> */}
    {/* {<MuiGrid/>} */}
    {/* {<MuiAvatar/>} */}
    {/* <ParentChild/> */}
    {/* <Molecule/> */}
    {/* <MuiSlider/> */}
    {/* <Ex/> */}
    {/* <InputComponent/> */}
    <NewCashKickComponent/>
    </div>
    // </ThemeProvider>
  );
}

export default App;
