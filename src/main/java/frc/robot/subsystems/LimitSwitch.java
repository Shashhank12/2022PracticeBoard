// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LimitSwitch extends SubsystemBase {
  /** Creates a new LimitSwitch. */
  
  public DigitalInput limitSwitch = new DigitalInput(Constants.limitSwitchPort);
  
  public LimitSwitch() 
  {

  }

  @Override
  public void periodic() 
  {
    /*
    if(limitSwitch.get())
    {
       System.out.println("Switch is on");
       LOLE.getPIDController().setReference(0.5, ControlType.kDutyCycle);
    }
    else
    {
      System.out.println("Switch is off");
      LOLE.getPIDController().setReference(0, ControlType.kDutyCycle);
    */
  }
}
