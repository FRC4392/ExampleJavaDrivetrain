package com.decivers4392.ExampleDrivetrain.Subsystems;

import com.decivers4392.ExampleDrivetrain.Constants;
import edu.wpi.first.wpilibj.Joystick;

/**
 * Created by kzakfeld on 12/3/16.
 */
public class Controls {
    private Joystick mDriverJoy;

    public Controls(){
        //Create new Joystick
        mDriverJoy = new Joystick(Constants.kDriverJoystickId);
    }

    public double getLeftStick(){
        //Get the axis of the joystick
        return mDriverJoy.getRawAxis(0);
    }

    public double getRightStick(){
        //Get the axis of the joystick
        return mDriverJoy.getRawAxis(3);
    }
}
