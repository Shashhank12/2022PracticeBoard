// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems;

//All imports
//import com.revrobotics.CANError;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.DigitalInput;
;
/*
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
*/ 
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

//Public class
public class Motor extends SubsystemBase 
{
  public DigitalInput limitSwitch = new DigitalInput(Constants.limitswitchport);
  /** Creates a new Motor. */
  public CANSparkMax CanSparkMotor = new CANSparkMax(Constants.motorport, MotorType.kBrushless);
  //public ADXRS450_Gyro gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

  //CanSparkMotorPID
  public static final double CanSparkMotorP = 0.00005;
  public static final double CanSparkMotorI = 0.000001;
  public static final double CanSparkMotorD = 0.00000001;
  
  public Motor()
  {
    CanSparkMotor.getPIDController().setP(CanSparkMotorP);
    CanSparkMotor.getPIDController().setI(CanSparkMotorI);
    CanSparkMotor.getPIDController().setD(CanSparkMotorD);
    CanSparkMotor.getPIDController().setOutputRange(-0.5, 0.5);
    CanSparkMotor.getEncoder().setPosition(0);
    CanSparkMotor.getEncoder().setPositionConversionFactor(1024);

  }

  public void setSpeed(double speed)
  {
    //CanSparkMotor.getPIDController().setReference(speed, ControlType.kDutyCycle);
    //CanSparkMotor.set(speed); 
  }
  
  @Override
  public void periodic() 
  {
    CanSparkMotor.getPIDController().setReference(1024, ControlType.kPosition);
    System.out.println(CanSparkMotor.getEncoder().getPosition());
    //double angle = gyro.getAngle();
    //System.out.println(angle);
    /*if(limitSwitch.get())
    {
       System.out.println("Switch is on");
       LOLE.getPIDController().setReference(0.5, ControlType.kDutyCycle);
    }
    else
    {
      System.out.println("Switch is off");
      LOLE.getPIDController().setReference(0, ControlType.kDutyCycle);
    }*/
  }

}
