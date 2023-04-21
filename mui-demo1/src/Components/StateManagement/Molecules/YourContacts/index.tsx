import { number } from "prop-types";
import IconButtonComponent from "../../Atoms/IconButton";
import TypographyComponent from "../../Atoms/Typography";
import { Stack, Grid, TableContainer, Table, TableBody, TableHead, TableRow, TableCell, Checkbox, styled } from '@mui/material'
import {  useState, createContext, useEffect  } from 'react'
import React from "react";
// const StyledGrid = styled(Grid)({
//     color:'#E8E7F0',
// })

interface TableData {
    id: number;
    Name: string;
    Type: string;
    "Per Payment": number;
    "Term length": string;
    Payment: number;
    checked?: boolean;
}

interface Props {
    total:number,
    getTotal:(sum:number,cnt:number)=>void,
    update?:number,
    checked?: boolean;
}

const YourContractsComponent = (props : Props) => 
{
    
    const [headerChecked, setHeaderChecked] = useState(false);
    const [total, setTotal] = useState(0);
    const [count,setCount] = useState(0);
    const [checked, setChecked] = useState(true);
    
    useEffect(() => {
       props.getTotal(total, count);
      
    }, [total,count, props])

    const handleCheckboxChange = (payment: number, checked: boolean) => {
        if (checked) {
          setTotal((prev) => prev + payment);
          setCount((prev) => prev + 1);
        } else {
          setTotal((prev) => prev - payment);
          setCount((prev) => prev - 1);
        }
      };
    
      const handleHeaderCheckboxChange = (event: React.ChangeEvent<HTMLInputElement>, checked: boolean) => {
        const allChecked = tableData.every((row) => row.checked);
        const newHeaderChecked = !headerChecked;
        setHeaderChecked(newHeaderChecked);
        
        tableData.forEach((row) => {
            if (row.checked !== newHeaderChecked) {
                handleCheckboxChange(row.Payment, newHeaderChecked);
                row.checked = newHeaderChecked;
            }
        });
    };
    
      const handleRowCheckboxChange = (row: TableData) => {
        const newChecked = !row.checked;
        handleCheckboxChange(row.Payment, newChecked);
        row.checked = newChecked;
    
        const allChecked = tableData.every((row) => row.checked);
        setHeaderChecked(allChecked);
    };
    return (
    
        <Stack border='2px solid #28272B'>

            <TypographyComponent>
                Your Contracts
                <IconButtonComponent><img src='asset/info-circle.svg' alt='infoC' ></img> </IconButtonComponent>
            </TypographyComponent>

            <TableContainer sx={{ overflowY: 'scroll' }}>
                <Table aria-label="table" sx={{ color: '#E8E7F0', overflow: 'scroll' }} >
                    <TableHead>
                        <TableRow sx={{ color: '#E8E7F0', }}>
                            <TableCell ><Checkbox sx={{ color: '#E8E7F0', }} checked={headerChecked} onChange={handleHeaderCheckboxChange}/></TableCell>
                            <TableCell sx={{ color: '#E8E7F0', }}>Id</TableCell>
                            <TableCell sx={{ color: '#E8E7F0', }}>Name</TableCell>
                            <TableCell sx={{ color: '#E8E7F0', }}>Type</TableCell>
                            <TableCell sx={{ color: '#E8E7F0', }}>Per Payment</TableCell>
                            <TableCell sx={{ color: '#E8E7F0', }}>Term Lenght</TableCell>
                            <TableCell sx={{ color: '#E8E7F0', }}>Payment</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {
                            tableData.map(row => ( 
                                <TableRow key={row.id}>
                                    <TableCell > 
                                        <Checkbox 
                                        checked={row.checked} 
                                        onChange={() => handleRowCheckboxChange(row)}
                                        // hadleC(id)
                                        // onChange={e => {
                                        //     if(e.target.checked) 
                                        //      { 
                                        //          setTotal(prev => prev + row.Payment); 
                                        //          setCount(count+1 );
                                        //             // props.getTotal(total,count); 
                                                        
                                        //     }
                                        //     else
                                        //     { 
                                        //         setTotal(prev => prev - row.Payment);
                                        //         setCount(count-1 );
                                        //         // props.getTotal(total,count);
                                               
                                        //     }
                                        //     console.log(total)
                                        // }}
                                        sx={{ color: '#E8E7F0', }} /> 
                                    </TableCell>
                                    <TableCell sx={{ color: '#E8E7F0', }}>{row.id}</TableCell>
                                    <TableCell sx={{ color: '#E8E7F0', }} >{row.Name}</TableCell>
                                    <TableCell sx={{ color: '#E8E7F0', }} >{row.Type}</TableCell>
                                    <TableCell sx={{ color: '#E8E7F0', }} >{row["Per Payment"]}</TableCell>
                                    <TableCell sx={{ color: '#E8E7F0', }} >{row["Term length"]}</TableCell>
                                    <TableCell sx={{ color: '#E8E7F0', }} >{row.Payment}</TableCell>
                                </TableRow>
                            ))
                        }
                    </TableBody>
                </Table>
            </TableContainer>


        </Stack>

    )
    
}

const tableData = [
    {

        'id': 1,
        'Name': 'Contract 1',
        'Type': 'Monthly',
        'Per Payment': 12000,
        'Term length': '12 Months 12.0%',
        'Payment': 126000,
        checked: false
    },
    {
        'id': 2,
        'Name': 'Contract 2',
        'Type': 'Monthly',
        'Per Payment': 12000,
        'Term length': '12 Months 12.0%',
        'Payment': 126000,checked: false
    },
    {
        'id': 3,
        'Name': 'Contract 3',
        'Type': 'Monthly',
        'Per Payment': 12000,
        'Term length': '12 Months 12.0%',
        'Payment': 126000,
        checked: false
    },
    {
        'id': 4,
        'Name': 'Contract 4',
        'Type': 'Monthly',
        'Per Payment': 12000,
        'Term length': '12 Months 12.0%',
        'Payment': 126000,
        checked: false
    },
    {
        'id': 5,
        'Name': 'Contract 5',
        'Type': 'Monthly',
        'Per Payment': 12000,
        'Term length': '12 Months 12.0%',
        'Payment': 126000,
        checked: false
    },
    {
        'id': 6,
        'Name': 'Contract 6',
        'Type': 'Monthly',
        'Per Payment': 12000,
        'Term length': '12 Months 12.0%',
        'Payment': 126000,
        checked: false
    },
    {
        'id': 7,
        'Name': 'Contract 7',
        'Type': 'Monthly',
        'Per Payment': 12000,
        'Term length': '12 Months 12.0%',
        'Payment': 126000,
        checked: false
    }
]
export default YourContractsComponent





    // const handleCheckboxChange = (row:any ) => {
    //     console.log(row.target)
    //     setIsChecked(true);
    //     if( isChecked )
    //     setTotal(total + Number(row.Payment));
    //     console.log(total)
    //   };

    //   const handleCheckboxChange = () => {
    //     setIsChecked(true);
    //   }
    //   const handleCheckboxChange = (event:any, row:any) => {
    //     // isChecked = event.target.checked;
    //     setIsChecked(isChecked);
    //     const payment = isChecked ? row.Payment : -row.Payment;
    //     setTotalPayment(totalPayment + payment);
    //     console.log(payment)
    // }

    // const [isChecked, setIsChecked] = useState({});
    // const [total, setTotal] = useState(0);

    // const handleCheckboxChange = (id, payment) => {
    //   setIsChecked((prevState) => ({ ...prevState, [id]: !prevState[id] }));
    //   setTotal((prevTotal) => {
    //     if (isChecked[id]) {
    //       return prevTotal - payment;
    //     } else {
    //       return prevTotal + payment;
    //     }
    //   });
    // };

// onChange={() => {
//     if(isChecked)
//     {
//     setTotal(total+row.Payment);
//     setIsChecked(false)
//     }
//     else
//     {
//     setTotal(total-row.Payment)
//     setIsChecked(false)
//     }
//    console.log(total)
// }
// }


