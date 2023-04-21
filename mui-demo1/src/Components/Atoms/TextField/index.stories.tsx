import TextFieldComponent from '../TextField'
import {ComponentStory , ComponentMeta} from '@storybook/react';
import { Clear } from '@mui/icons-material';


export default {
    title:'Atoms/TextFieldComponent',
    Component:TextFieldComponent,
}as ComponentMeta<typeof TextFieldComponent>

const Template:ComponentStory<typeof TextFieldComponent> = (args)=>(
    <TextFieldComponent  {...args}/>
)

export const TextField1 = Template.bind({});
TextField1.args={
    placeholder:'My first advance',
    variant:'filled',
    Icon:<Clear />
}