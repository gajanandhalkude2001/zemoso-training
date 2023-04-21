
import TypographyComponent from "../../Atoms/Typography";
import IconButtonComponent from "../../Atoms/IconButton";
import { Stack, Table, TableCell, TableHead, TableContainer, TableRow, TableBody } from '@mui/material';
import ButtonComponent from "../../Atoms/Button";

const HomeBarComponent = () =>
(
    
    <Stack padding='10px'>
        <Stack spacing={90} direction='row'>
            <Stack spacing={0} padding='10px'>
                <TypographyComponent variant='h6'>Good Morning</TypographyComponent>
                <TypographyComponent variant='subtitle1'>{new Date().toLocaleString('en-US')}</TypographyComponent>
            </Stack>
            <Stack alignItems='flex-start' justifyContent='flex-start'>
                <TypographyComponent ><IconButtonComponent><img src='asset/avatar+icon.svg' alt='pic' ></img> </IconButtonComponent> </TypographyComponent>
            </Stack>
        </Stack>

        <Stack direction='row' spacing={1}>
            <IconButtonComponent> <img src='asset/homepage.svg' alt ='pic'></img> </IconButtonComponent>
            <Stack spacing={2} padding='15px'>
                <TypographyComponent variant="h6">Lanch a New Cash Kick</TypographyComponent>
                <TypographyComponent variant='subtitle2'>You have upto $80000 available for a new cash Advance</TypographyComponent>
                <ButtonComponent variant='contained'   > New Cash Kick</ButtonComponent>
            </Stack>
        </Stack>

        <Stack padding='10px'>
            <Stack border='2px solid #28272B'>
                <TypographyComponent>
                    Your Contracts
                    <IconButtonComponent><img src='asset/info-circle.svg' alt='pic'></img> </IconButtonComponent>
                </TypographyComponent>

                <TableContainer >
                    <Table aria-label="table" >
                        <TableHead >
                            <TableRow sx={{justifyContent:'space-evenly'}}>
                                <TableCell sx={{ color: '#E8E7F0', }}>Due Date</TableCell>
                                <TableCell sx={{ color: '#E8E7F0', }}>Status</TableCell>
                                <TableCell sx={{ color: '#E8E7F0', }}>Expected Amount</TableCell>
                                <TableCell sx={{ color: '#E8E7F0', }}>OutStanding</TableCell>
                            </TableRow>
                        </TableHead>
                        <TableBody sx={{alignItems:'center'}}>
                        <IconButtonComponent sx={{alignItems:'center'}}><img src='asset/Cheque.svg' alt="cheque_image"></img> </IconButtonComponent>
                        </TableBody>
                    </Table>
                </TableContainer>
            </Stack>
        </Stack>
    </Stack>
        )
        export default HomeBarComponent