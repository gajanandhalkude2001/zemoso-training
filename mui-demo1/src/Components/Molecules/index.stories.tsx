import {ComponentStory , ComponentMeta} from '@storybook/react';
import Molecule from "./index";

export default {
    title:'Molecules/CashKickMole',
    Component:Molecule,

} as ComponentMeta<typeof Molecule>

const Template:ComponentStory<typeof Molecule> = (args)=>(
    <Molecule/>
)

export const primary = Template.bind({});