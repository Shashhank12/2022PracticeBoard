// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import java.util.ResourceBundle.Control;

import javax.swing.text.Position;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import frc.robot.Constants;

public class TalonFXMotor extends SubsystemBase 
{
  /** Initializes TalonFXMotor. */ 
    WPI_TalonFX MotorWithWheel = new WPI_TalonFX(3);

  //PID for TalonFX
    public static final double TalonFX_P = 0.001;
    public static final double TalonFX_I = 0.000000000;
    public static final double TalonFX_D = 0.00000000;


  public TalonFXMotor() 
  {
    MotorWithWheel.configFactoryDefault();
    MotorWithWheel.setSelectedSensorPosition(0);
    MotorWithWheel.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor, 0, 30);
    MotorWithWheel.configAllowableClosedloopError(0, 0, 0);
    MotorWithWheel.setSensorPhase(true);
    //Initialize PID
    MotorWithWheel.config_kP(0, TalonFX_P, 0);
    MotorWithWheel.config_kI(0, TalonFX_I, 0);
    MotorWithWheel.config_kD(0, TalonFX_D, 0);

    

    //MotorWithWheel.config_

    

    //Testing max Output
    MotorWithWheel.configNominalOutputForward(0, 30);
    MotorWithWheel.configNominalOutputReverse(0, 30);
    MotorWithWheel.configPeakOutputForward(0.5);
    MotorWithWheel.configPeakOutputReverse(-0.5);
    
    
  }
  //public void setSpeed(double speed)
  //{
    //MotorWithWheel.set(speed);
  //}

  //public void setPosition(double Position)
  //{
    //MotorWithWheel.set(ControlMode.Position, Position);
  //}

  
  public double CanSparkMotorPosition()
  {
    return MotorWithWheel.getSelectedSensorPosition();
  }
  
  //public double CanSparkMotorSpeed()
  //{
    //return MotorWithWheel.get();
  //}
  


  @Override
  public void periodic() 
  {
    //MotorWithWheel.set(ControlMode.Position, 0, DemandType.ArbitraryFeedForward, -0.1);
    //MotorWithWheel.set(ControlMode.Position, 1);
    MotorWithWheel.set(TalonFXControlMode.Position, 0, DemandType.AuxPID, 0);
    //System.out.println(MotorWithWheel.getSelectedSensorPosition());
    
    //System.out.println(MotorWithWheel.getDescription());
    
    // This method will be called once per scheduler run
  }
}
