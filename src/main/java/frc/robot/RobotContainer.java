// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.Gyros.ADIS16470_IMU;
import frc.robot.commands.Gyros.ADXRS450Gyro;
import frc.robot.commands.Gyros.NavxAHRSGyro;
import frc.robot.commands.Motors.REV;
import frc.robot.commands.Switch.LimitSwitch;
import frc.robot.subsystems.NeoMotor;
import frc.robot.subsystems.TalonFXMotor;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  //Subsystems
    //Neo subsystem initialized
      public static final NeoMotor m_motor = new NeoMotor();
    //LimitSwitch subsystem initialized
      public static final frc.robot.subsystems.LimitSwitch m_limitSwitch = new frc.robot.subsystems.LimitSwitch();
    //Talon subsystem initialized
      public static final TalonFXMotor m_talonFXMotor = new TalonFXMotor();
    //Gyros subsystem(ADXRS, ADIS, AHRS) initialized
          public static final frc.robot.subsystems.Gyros m_onboardGyro = new frc.robot.subsystems.Gyros();
  //Commands
    //Gyros
      //ADIS16470 initialized
        public static final ADIS16470_IMU cm_IMU = new ADIS16470_IMU();
      //ADXRS450 initialized
        public static final ADXRS450Gyro cm_SuckyGyro = new ADXRS450Gyro();
      //NavxAHRSGyro initialized
        public static final NavxAHRSGyro cm_PitchRollYaw = new NavxAHRSGyro();
    //Motors
      //TalonFX Initialized
        public static final frc.robot.commands.Motors.Falcon500 cm_CTREFalcon = new frc.robot.commands.Motors.Falcon500();
      //Neo Initialized
        public static final REV cm_REVNeoMotor = new REV();
  //Switch
    //LimitSwitch
  public static final LimitSwitch cm_limitSwitch = new LimitSwitch();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() 
  {
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
