// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import java.util.ResourceBundle.Control;

import javax.swing.text.Position;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonFXConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.music.Orchestra;

import frc.robot.Constants;

public class TalonFXMotor extends SubsystemBase 
{
  /** Initializes TalonFXMotor. */ 
    TalonFX MotorWithWheel = new TalonFX(Constants.talonFXMotorPort);

  //PID for TalonFX
    public static final double TalonFX_F = 0;
    public static final double TalonFX_P = 0.1;
    public static final double TalonFX_I = 0.0000;
    public static final double TalonFX_D = 0.00000;

    public static final int timeoutSecondsTalonFX = 1;

  


  public TalonFXMotor() 
  {
    MotorWithWheel.configFactoryDefault();
    //MotorWithWheel.configAllSettings(TalonFXControlMode.Position);
    MotorWithWheel.setSelectedSensorPosition(0, Constants.PIDSlot, 30);
    MotorWithWheel.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor, 0, 30);
    //MotorWithWheel.configAllowableClosedloopError(Constants.PIDSlot, 1, 1);
    //MotorWithWheel.setSensorPhase(true);
    //MotorWithWheel.setNeutralMode(NeutralMode.Coast);

    //MotorWithWheel.configClosedLoopPeakOutput(Constants.PIDSlot, 0.5);
    //MotorWithWheel.configClosedLoopPeriod(Constants.PIDSlot, 1);

    //Initialize PID
    MotorWithWheel.config_kF(Constants.PIDSlot, TalonFX_F);
    MotorWithWheel.config_kP(Constants.PIDSlot, TalonFX_P);
    MotorWithWheel.config_kI(Constants.PIDSlot, TalonFX_I);
    MotorWithWheel.config_kD(Constants.PIDSlot, TalonFX_D);

    MotorWithWheel.configMotionCruiseVelocity(1000);
    MotorWithWheel.configMotionAcceleration(500);
    //MotorWithWheel.configMotionSCurveStrength(2);

    

    //MotorWithWheel.config_

    //Xax Output
    MotorWithWheel.configNominalOutputForward(0);
    MotorWithWheel.configNominalOutputReverse(0);
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
  //
//}
  


  @Override
  public void periodic() 
  {
    //MotorWithWheel.set(ControlMode.Position, 0, DemandType.ArbitraryFeedForward, -0.1);
    //MotorWithWheel.set(ControlMode.Position, 1);
    //MotorWithWheel.set(TalonFXControlMode.Position, 0, DemandType.AuxPID, 0);
    /*if(MotorWithWheel.getSelectedSensorPosition() >= 20200)
    {
      MotorWithWheel.set(ControlMode.Position, 20480);
    }
    else
    {
      MotorWithWheel.set(ControlMode.MotionMagic, 20480);
    }
    */
    
    //System.out.println(MotorWithWheel.getSelectedSensorPosition());
    //System.out.print(MotorWithWheel.getMotorOutputVoltage());
    //System.out.println(MotorWithWheel.getClosedLoopError(0));
    //System.out.println(MotorWithWheel.getSelectedSensorPosition());

    //System.out.println(MotorWithWheel.getDescription());
    
    // This method will be called once per scheduler run
  }
}
