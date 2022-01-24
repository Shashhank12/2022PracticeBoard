// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import frc.robot.commands.LimitSwitch;
import frc.robot.commands.OnBoardGyro;
//import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Motor;
import frc.robot.subsystems.TalonFXMotor;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  //Commands and Subsystem for Motor
  public static final Motor m_motor = new Motor();
  //public static final frc.robot.commands.Motor cm_motor = new frc.robot.commands.Motor();

  //Commands and Subsystem for LimitSwitch
  public static final frc.robot.subsystems.LimitSwitch m_limitSwitch = new frc.robot.subsystems.LimitSwitch();
  public static final LimitSwitch cm_limitSwitch = new LimitSwitch();

  //Commands and Subsystem for TalonFXMotor
  public static final TalonFXMotor m_talonFXMotor = new TalonFXMotor();
  public static final frc.robot.commands.TalonFXMotor cm_talonFXMotor = new frc.robot.commands.TalonFXMotor();

  //Commands and Subsystem for Gyro
  public static final OnBoardGyro cm_gyro = new OnBoardGyro();
  public static final frc.robot.subsystems.OnBoardGyro m_onboardGyro = new frc.robot.subsystems.OnBoardGyro();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  //public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    //return m_autoCommand;
  //}
}
