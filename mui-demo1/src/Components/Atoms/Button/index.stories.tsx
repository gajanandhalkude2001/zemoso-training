import {ButtonComponent} from '../Button'
import {ComponentStory , ComponentMeta} from '@storybook/react';

export default {
    title:'Atoms/ButtonComponent',
    Component:ButtonComponent,
}as ComponentMeta<typeof ButtonComponent>

const Template:ComponentStory<typeof ButtonComponent> = (args)=>(
    <ButtonComponent {...args}/>
)

export const CancelButton = Template.bind({});
CancelButton.args = {
    children:'Cancel',
    variant:'outlined',
    color:'warning'
}

export const CashKickButton = Template.bind({});
CashKickButton.args = {
    children:'Cash Kick Button',
    variant:'contained',
    color:'warning'
}