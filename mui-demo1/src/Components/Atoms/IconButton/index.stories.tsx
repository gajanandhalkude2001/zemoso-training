import IconComponent from '../IconButton';
import {ComponentStory , ComponentMeta} from '@storybook/react';
import ClearIcon from '@mui/icons-material/Clear'

export default {
    title:'Atoms/IconButtons',
    Component:IconComponent,
} as ComponentMeta<typeof IconComponent>

const Template:ComponentStory<typeof IconComponent> = (args)=>(
    <IconComponent {...args}/>
)

export const ClearIconC = Template.bind({});
ClearIconC.args={
    children:<ClearIcon/>
}