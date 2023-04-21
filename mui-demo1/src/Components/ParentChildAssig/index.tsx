import { styled } from "@mui/material";
import {
  Box,
  Card,
  CardActions,
  CardContent,
  Typography,
  Button,
  ButtonGroup,
  TextField,
  Stack,
} from "@mui/material";
import ClearIcon from "@mui/icons-material/Clear";
import React from "react";

const BoxStyled = styled(Box)({
  width: "650px",
  height: "116px",
  padding: "32px, 40px, 24px, 40px",
  margin: "100px",
  marginLeft: "260px",
  gap: "8px",
  backgroundColor: "#262529",
});

const CardStyled = styled(Card)({
  backgroundColor: "#262529",
});

const StyledTypography1 = styled(Typography)({
  marginTop: "16px",
});

const StyledTypography2 = styled(Typography)({
  width: "552px",
  height: "22px",
  left: "4px",
  top: "70px",
});

const StyledTextField = styled(TextField)({
  backgroundColor: "grey",
  width: "545px",
  height: "56px",
  top: "8px",
  marginLeft: "35px",
  borderRadius: "12px",
  padding: "12px,17px,12px,17px",
  gap: "12px",
  border: "1px purple",
});

const StyledCardActions = styled(CardActions)({
  padding: "32px ,40px ,24px ,40px",
  width: "640px",
  top: "247px",
  gap: "8px",
  height: "116px",
  border: "1px #413F4D",
});

function ParentChild() {
  return (
    <BoxStyled>
      <CardStyled>
        <CardContent>
          <Stack
            direction="row"
            width="640px"
            height="113px"
            padding="24px,40px,24px,40px"
            gap="8px"
          >
            <Stack marginLeft="35px">
              <Typography
                variant="h4"
                color="#E8E7F0"
                fontWeight={600}
                fontSize="28"
                width="520px"
                height="34px"
                letterSpacing="-0.5%"
              >
                Name Your Cash Kick
              </Typography>

              <StyledTypography1
                variant="h5"
                color="#A5A5A6"
                fontWeight={500}
                fontSize="18px"
                width="520px"
                height="27px"
                top="38px"
              >
                Add a name to identify your Cash Kick
              </StyledTypography1>
            </Stack>

            <Stack width="50px" height="50px" border="10px icon">
              <ClearIcon sx={{ color: "white" }}></ClearIcon>
            </Stack>
          </Stack>

          <StyledTypography2
            color="#B4A9FF"
            variant="body1"
            fontFamily="Gilroy"
            marginLeft="35px"
            fontWeight="500"
            fontSize="16px"
            lineHeight="22.4px"
          >
            Cash kick name
          </StyledTypography2>
          <StyledTextField placeholder="My first advance" color="primary" />
        </CardContent>

        <StyledCardActions>
          <ButtonGroup>
            <Button
              style={{
                marginLeft: "-5px",
                color: "grey",
                backgroundColor: "#2D2D30",
                width: "133px",
                height: "60px",
                top: "32px",
                left: "251px",
                borderRadius: "12px",
                padding: "20px,40px,20px,40px",
                gap: "8px",
              }}
            >
              Cancel
            </Button>
            <Button
              variant="contained"
              style={{
                color: "white",
                backgroundColor: "#6C5DD3",
                width: "208px",
                height: "60px",
                top: "32px",
                left: "259px",
                borderRadius: "12px",
                padding: "20px,40px,20px,40px",
                gap: "8px",
              }}
            >
              Create Cash Kick
            </Button>
          </ButtonGroup>
        </StyledCardActions>
      </CardStyled>
    </BoxStyled>
  );
}

export default ParentChild;
