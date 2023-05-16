// import SideBarComponent from "../../Molecules/SideBar";
// import { Grid,styled } from '@mui/material'
// import NavBarComponent from "../../Molecules/NavBar";
// import SummaryComponent from "../../Molecules/Summary";
// import YourContractsComponent from "../../Molecules/YourContacts";
// import {useState} from "react";
// import HomeBarComponent from "../../Molecules/HomeBar";

// const StyledGrid = styled(Grid)({
//     backgroundColor:'#201F24',
//     color:'#E8E7F0',
//     flexGrow:'1',
//     height:'100%'
// })

// const NewCashKickComponent = () =>
// {
//     const getTotal = (sum:number,cnt:number) =>(
//         setTotal(sum),
//         setCount(cnt)
//     )

//     const [state,setState] = useState(false)
//     const [showHome,setShowHome] = useState(false)
//     const [total,setTotal] = useState(0);
//     const [count,setCount] = useState(0)
//     const [update,setUpdate] = useState(0)

//      const handleCash = ()=>
//     (
//         setShowHome((e) => !e) ,
//         setState(e => !e)

//     )
    
//     //  const handleHome = ()=>
//     // (
//     //     setShowHome(true),
//     //     setState(false)
//     // )
    
//     if(handleCash) 
//     return (
//     <StyledGrid  display='flex' border='2px solid #28272B' height='100vh' gap={1}>
//         <Grid item>
//             <SideBarComponent onClick={handleCash} />
//         </Grid>
//         {
//         state?
//         (
//         <Grid item justifyContent='center' display='block' flexGrow={1}>
//             <Grid>
//                 <NavBarComponent />
//             </Grid>

//             <Grid item display='flex' columnGap={4} padding='20px'>
//                 <YourContractsComponent  handleTotal={ ()=> getTotal }  />
//                 <SummaryComponent total={total} count={count}/>
//             </Grid>
//         </Grid>)
//         :
//         <HomeBarComponent/>
//         }
        
//     </StyledGrid>
//     )
//     else
//     return (
//     <StyledGrid  display='flex' border='2px solid #28272B' height='100vh' gap={1}>
//         <Grid item>
//             <SideBarComponent  onClick={ handleCash }/>
//         </Grid>
//         {
//         showHome?
//         (
//             <HomeBarComponent/>
//         )
//         :
//         <Grid item justifyContent='center' display='block' flexGrow={1}>
//             <Grid>
//                 <NavBarComponent />
//             </Grid>

//             {/* <Grid item display='flex' columnGap={4} padding='20px'>
//                 <YourContractsComponent setUpdate={ ()=> setUpdate }  handleTotal={ ()=> getTotal } />
//                 <SummaryComponent total={total} count={count}/>
//             </Grid> */}
//              <Grid item display='flex' columnGap={4} padding='20px'>
//                 <YourContractsComponent   />
//                 <SummaryComponent total={total} count={count}/>
//             </Grid>
//         </Grid>
//         }
        
//     </StyledGrid>
//     )
// }
// export default NewCashKickComponent

// export {}


// // const [showElement, setShowElement] = useState(false);
  
// // const handleCashAcceleration = () => {
// //   setShowElement(true);
// // };  
// //  {/* Conditionally render the RenderTable component */}
// //  {showElement ? <NewCashKickComponent /> : null}



//*********************************************************************************************************//



import SideBarComponent from "../../Molecules/SideBar";
import { Grid,styled } from '@mui/material'
import NavBarComponent from "../../Molecules/NavBar";
import SummaryComponent from "../../Molecules/Summary";
import YourContractsComponent from "../../Molecules/YourContacts";
import {useState} from "react";
import HomeBarComponent from "../../Molecules/HomeBar";
import React from "react";

const StyledGrid = styled(Grid)({
    backgroundColor:'#201F24',
    color:'#E8E7F0',
    flexGrow:'1',
    height:'100%'
})

const NewCashKickComponent = () =>
{
    const [state,setState] = useState(false)
    const [showHome,setShowHome] = useState(false)

    const [total,setTotal] = useState(0);
    const [count,setCount] = useState(0)
    
    const getTotal = (sum:number,cnt:number) =>(
        setTotal(sum),
        setCount(cnt)
    )

     const handleCash = ()=>
    (
        setShowHome((e) => !e) ,
        setState(e => !e)

    )
    
    //  const handleHome = ()=>
    // (
    //     setShowHome(true),
    //     setState(false)
    // )
    
    if(handleCash) 
    return (
    <StyledGrid  display='flex' border='2px solid #28272B' height='100vh' gap={1}>
        <Grid item>
            <SideBarComponent onClick={handleCash} />
        </Grid>
        {
        state?
        (
        <Grid item justifyContent='center' display='block' flexGrow={1}>
            <Grid>
                <NavBarComponent />
            </Grid>

            <Grid item display='flex' columnGap={4} padding='20px'>
                {/* <YourContractsComponent  handleTotal={ ()=> getTotal }  /> */}
                <YourContractsComponent total={total}  getTotal={getTotal}/>
                <SummaryComponent total={total} count={count} getTotal={getTotal}/>
            </Grid>
        </Grid>)
        :
        <HomeBarComponent/>
        }
        
    </StyledGrid>
    )
    else
    return (
    <StyledGrid  display='flex' border='2px solid #28272B' height='100vh' gap={1}>
        <Grid item>
            <SideBarComponent  onClick={ handleCash }/>
        </Grid>
        {
        showHome?
        (
            <HomeBarComponent/>
        )
        :
        <Grid item justifyContent='center' display='block' flexGrow={1}>
            <Grid>
                <NavBarComponent />
            </Grid>

            {/* <Grid item display='flex' columnGap={4} padding='20px'>
                <YourContractsComponent setUpdate={ ()=> setUpdate }  handleTotal={ ()=> getTotal } />
                <SummaryComponent total={total} count={count}/>
            </Grid> */}
             <Grid item display='flex' columnGap={4} padding='20px'>
                <YourContractsComponent total={total}   getTotal={getTotal}/>
                <SummaryComponent total={total} count={count} getTotal={getTotal}/>
            </Grid>
        </Grid>
        }
        
    </StyledGrid>
    )
}
export default NewCashKickComponent

export {}


// const [showElement, setShowElement] = useState(false);
  
// const handleCashAcceleration = () => {
//   setShowElement(true);
// };  
//  {/* Conditionally render the RenderTable component */}
//  {showElement ? <NewCashKickComponent /> : null}