package frc.robot.sensors;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

/**
 * Add your docs here.
 */
public class ShuffleBoard{

    public boolean update = false;
    public ShuffleboardTab GamePlay = Shuffleboard.getTab("GamePlay");
        public NetworkTableEntry outreachMode = GamePlay.add("outreachMode", false).getEntry();
        public NetworkTableEntry noArm = GamePlay.add("noArm", false).getEntry();
        
    public ShuffleboardTab Tune = Shuffleboard.getTab("Tune");
        private ShuffleboardLayout driveTune = Tune.getLayout("driveTune", BuiltInLayouts.kList);
            public NetworkTableEntry driveType = driveTune.addPersistent("driveType", "a").getEntry(); // a=arcade, c=cheezy, f=field
            public NetworkTableEntry driveSpeed = driveTune.addPersistent("driveSpeed", 0).getEntry();
            public NetworkTableEntry driveSmooth = driveTune.addPersistent("driveSmooth", 0).getEntry();
            public NetworkTableEntry drivePidP = driveTune.addPersistent("drivePID-P", 0).getEntry();
            public NetworkTableEntry drivePidI = driveTune.addPersistent("drivePID-P", 0).getEntry();
            public NetworkTableEntry drivePidD = driveTune.addPersistent("drivePID-P", 0).getEntry();
            public NetworkTableEntry driveTurnPidP = driveTune.addPersistent("driveTurnPID-P", 0).getEntry();
            public NetworkTableEntry driveTurnPidI = driveTune.addPersistent("driveTurnPID-P", 0).getEntry();
            public NetworkTableEntry driveTurnPidD = driveTune.addPersistent("driveTurnPID-P", 0).getEntry();

        private ShuffleboardLayout ballTune = Tune.getLayout("ballTune", BuiltInLayouts.kList);
            public NetworkTableEntry ballIntakeSpeed = ballTune.addPersistent("ballIntakeSpeed", .5).getEntry();
            public NetworkTableEntry ballFlickerInSpeed = ballTune.addPersistent("ballFlickerInSpeed", .5).getEntry();
            public NetworkTableEntry ballFluckerOutIntakeSpeed = ballTune.addPersistent("ballFluckerOutIntakeSpeed", -.5).getEntry();
            public NetworkTableEntry ballBeltsSpeed = ballTune.addPersistent("ballBeltsSpeed", .5).getEntry();
            public NetworkTableEntry ballBeltsOutIntakeSpeed = ballTune.addPersistent("ballBeltsOutIntakeSpeed", -.5).getEntry();
            public NetworkTableEntry ballBeltsOutOutputSpeed = ballTune.addPersistent("ballBeltsOutOutputSpeed", .5).getEntry();
            public NetworkTableEntry ballOutputSpeed = ballTune.addPersistent("ballOutputSpeed", .5).getEntry();

        private ShuffleboardLayout climbTune = Tune.getLayout("climbTune", BuiltInLayouts.kList);
            public NetworkTableEntry climbElevatorPidP = climbTune.addPersistent("climbElevatorPID-P", 0).getEntry();   
            public NetworkTableEntry climbElevatorPidI = climbTune.addPersistent("climbElevatorPID-I", 0).getEntry();   
            public NetworkTableEntry climbElevatorPidD = climbTune.addPersistent("climbElevatorPID-D", 0).getEntry();  
            public NetworkTableEntry climbElevatorPidF = climbTune.addPersistent("climbElevatorPID-F", 0).getEntry();  
        
            private ShuffleboardLayout driverTune = Tune.getLayout("driverTune", BuiltInLayouts.kList);
                public NetworkTableEntry driverErrorRumbleLength = driverTune.addPersistent("driverErrorRumbleLength", 0).getEntry();   


    public ShuffleboardTab Debug = Shuffleboard.getTab("Debug");
        private ShuffleboardLayout driveDebug = Debug.getLayout("driveDebug", BuiltInLayouts.kList);
            public NetworkTableEntry driveLeftOutput = driveDebug.add("driveLeftOutput", 0).getEntry();
            public NetworkTableEntry driveRightOutput = driveDebug.add("driveRightOutput", 0).getEntry();

        private ShuffleboardLayout pdpDebug = Debug.getLayout("pdpDebug", BuiltInLayouts.kList);
            public NetworkTableEntry pdpVoltage = pdpDebug.add("pdpVoltage", 0).getEntry();
            public NetworkTableEntry pdpTotalAmp = pdpDebug.add("pdpTotalAmp", 0).getEntry();
            public NetworkTableEntry pdpTemperature = pdpDebug.add("pdpTemperature", 0).getEntry();

        private ShuffleboardLayout limeLightDebug = Debug.getLayout("limeLightDebug", BuiltInLayouts.kList);
            public NetworkTableEntry limelightX = limeLightDebug.add("limelightX", 0).getEntry();
            public NetworkTableEntry limelightY = limeLightDebug.add("limelightY", 0).getEntry();
            public NetworkTableEntry limelightArea = limeLightDebug.add("limelightArea", 0).getEntry();

    public ShuffleBoard() {

    }
}   
