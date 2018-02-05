/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  public static void testCompile()
  {
      SimplePicture p = new SimplePicture();
  }
  
    /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture fC = new Picture("fingerCircle.jpg");
    fC.explore();
    fC.zeroBlue();
    fC.explore();
  }
  
    /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
      Picture fC = new Picture("fingerCircle.jpg");
      //fC.explore();
      fC.keepOnlyBlue();
      fC.explore();
  }
  
  /** Method to test negate*/
  public static void testNegate()
  {
      Picture fC = new Picture("fingerCircle.jpg");
      //fC.explore();
      fC.negate();
      fC.explore();
  }
  
  /** Method to test grayscale*/
  public static void testGrayscale()
  {
      Picture fC = new Picture("fingerCircle.jpg");
      //fC.explore();
      fC.grayscale();
      fC.explore();
  }
  
  /** Method to test fixUnderwater */
  public static void testFixUnderwater()
  {
      Picture water = new Picture("water.jpg");
      water.explore();
      water.fixUnderwater();
      water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test MirrorVerticalRightToLeft()*/
  public static void testMirrorVerticalRightToLeft()
  {
      Picture fC = new Picture("fingerCircle.jpg");
      //fC.explore();
      fC.mirrorVerticalRightToLeft();
      fC.explore();  
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    //testMirrorVertical();
    testMirrorVerticalRightToLeft();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}