package com.decivers4392.ExampleDrivetrain.Subsystems;

import com.decivers4392.ExampleDrivetrain.Constants;
import edu.wpi.first.wpilibj.CANTalon;

/**
 * Created by kzakfeld on 12/3/16.
 */
public class Drivetrain {
    private final CANTalon mLeft, mRight;

    public Drivetrain(){
        //Initialize two CANTalons for the left and right motor
        mLeft = new CANTalon(Constants.kLeftDrivetrainTalonId);
        mRight = new CANTalon(Constants.kRightDrivetrainTalonId);

        //Set the motor controllers so open loop mode for now
        mLeft.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
        mRight.changeControlMode(CANTalon.TalonControlMode.PercentVbus);

        //Ensure motors don't move on start
        mRight.set(0);
        mLeft.set(0);
    }

    public void setLeftRightPower(double left, double right){
        //Set the speed of both the left and right motors
        mRight.set(right);
        mLeft.set(left);
    }
}
