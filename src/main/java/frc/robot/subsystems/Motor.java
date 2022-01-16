// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems;

//All imports
//import com.revrobotics.CANError;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro; 
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

//Public class
public class Motor extends SubsystemBase 
{
  public DigitalInput limitSwitch = new DigitalInput(0);
  /** Creates a new Motor. */
  public CANSparkMax LOLE = new CANSparkMax(Constants.motorport, MotorType.kBrushless);
  //public ADXRS450_Gyro gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);
  
  public void setSpeed(double speed)
  {
    LOLE.getPIDController().setReference(speed, ControlType.kDutyCycle);
    //LOLE.set(speed);
    
  }
  
  @Override
  public void periodic() 
  {
    //double angle = gyro.getAngle();
    //System.out.println(angle);
    /*if(limitSwitch.get())
    {
       System.out.println("Switch is onn");
       LOLE.getPIDController().setReference(0.5, ControlType.kDutyCycle);
    }
    else
    {
      System.out.println("Switch is off");
      LOLE.getPIDController().setReference(0, ControlType.kDutyCycle);
    }*/
  }
}
