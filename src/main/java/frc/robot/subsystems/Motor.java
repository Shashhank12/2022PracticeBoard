// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems;

//All imports
//import com.revrobotics.CANError;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.ADIS16470_IMU;
//import edu.wpi.first.math.controller.PIDController;
//import edu.wpi.first.networktables.NetworkTableEntry;
//import edu.wpi.first.wpilibj.DigitalInput;
//import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
//import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.SPI;
/*
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
*/ 
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

//For Shuffleboard


//Public class
public class Motor extends SubsystemBase 
{
  
  /** Creates a new Motor. */
  public CANSparkMax CanSparkMotor = new CANSparkMax(Constants.motorPort, MotorType.kBrushless);
  //public static final ADIS16470_IMU imu = new ADIS16470_IMU();
  //public WPI_TalonFX MotorWithWheel = new WPI_TalonFX(Constants.talonfxmotor1port);
  //public ADXRS450_Gyro gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

  //CanSparkMotorPID
  public static final double CanSparkMotorP = 0.0005;
  public static final double CanSparkMotorI = 0.000001;
  public static final double CanSparkMotorD = 0.00003;
  
  public Motor()
  {
    CanSparkMotor.getPIDController().setP(CanSparkMotorP);
    CanSparkMotor.getPIDController().setI(CanSparkMotorI);
    CanSparkMotor.getPIDController().setD(CanSparkMotorD);
    CanSparkMotor.getPIDController().setOutputRange(-0.5, 0.5);
    CanSparkMotor.getEncoder().setPosition(0);
    CanSparkMotor.getEncoder().setPositionConversionFactor(1024);
    //SmartDashboard.putNumber("Subsystem Layout", CanSparkMotorP);
    //SmartDashboard.putNumber("I Value", CanSparkMotorP);
    
  }
  public double TestRandom()
  {
    return Math.random();
  }

  public void setSpeed(double speed)
  {
    //CanSparkMotor.getPIDController().setReference(speed, ControlType.kDutyCycle);
    //CanSparkMotor.set(speed); 
  }
  public void setPosition(double position)
  {
    CanSparkMotor.getPIDController().setReference(position, ControlType.kPosition);
  }

  public double CanSparkMotorPosition()
  {
    return CanSparkMotor.getEncoder().getPosition();
  }
  
  public double CanSparkMotorVelocity()
  {
    return CanSparkMotor.getEncoder().getVelocity();
  }
  
  @Override
  public void periodic() 
  {
    //CanSparkMotor.setSpeed(0.5);
    //System.out.println(imu.getAngle());
  }

}

