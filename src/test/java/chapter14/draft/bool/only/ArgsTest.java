package chapter14.draft.bool.only;

import clean.code.chapter14.draft.bool.only.Args;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ArgsTest {

  @Test
  public void testCreateWithNoSchemaOrArguments() throws Exception {
    Args args = new Args("", new String[0]);
    assertEquals(0, args.cardinality());
  }

  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  public void testWithNoSchemaButWithOneArgument() throws Exception {
    Args args = new Args("", new String[]{"-x"});
    assertEquals(false, args.isValid());
    assertEquals("Argument(s) -x unexpected.", args.errorMessage());
  }

  @Test
  public void testWithNoSchemaButWithMultipleArguments() throws Exception {
    Args args = new Args("", new String[]{"-x", "-y"});
    assertEquals(false, args.isValid());
    assertEquals("Argument(s) -xy unexpected.", args.errorMessage());
  }

  // Currently fails...
  @Test
  public void testNonLetterSchema() throws Exception {
    exception.expect(ParseException.class);
    exception.expectMessage("Bad character:*in Args format: *");

    new Args("*", new String[]{});
  }

  // Currently fails...
  @Test
  public void testInvalidArgumentFormat() throws Exception {
    exception.expect(ParseException.class);
    exception.expectMessage("Argument: f has invalid format: ~.");

    new Args("f~", new String[]{});
  }

  @Test
  public void testSimpleBooleanTruePresent() throws Exception {
    Args args = new Args("x", new String[]{"-x", "true"});
    assertEquals(1, args.cardinality());
    assertEquals(true, args.getBoolean('x'));
  }

  // Currently fails...
  @Test
  public void testSimpleBooleanFalsePresent() throws Exception {
    Args args = new Args("x", new String[]{"-x", "false"});
    assertEquals(1, args.cardinality());
    assertEquals(false, args.getBoolean('x'));
  }

  // Currently fails...
  @Test
  public void testMissingBooleanArgument() throws Exception {
    Args args = new Args("x", new String[]{"-x"});
    assertEquals(false, args.isValid());
  }

  // Currently fails...
  @Test
  public void testInvalidBoolean() throws Exception {
    Args args = new Args("x", new String[]{"-x", "Truthy"});
    assertEquals(1, args.cardinality());
    assertEquals(false, args.getBoolean('x'));
  }

  @Test
  public void testMultipleBooleans() throws Exception {
    Args args = new Args("x,y", new String[]{"-xy", "true", "true"});
    assertEquals(2, args.cardinality());
    assertEquals(true, args.getBoolean('x'));
    assertEquals(true, args.getBoolean('y'));
  }

  // Currently fails...
  @Test
  public void testSpacesInFormat() throws Exception {
    Args args = new Args("x, y", new String[]{"-xy", "true", "true"});
    assertEquals(2, args.cardinality());
    assertEquals(true, args.getBoolean('x'));
    assertEquals(true, args.getBoolean('y'));
  }

  // Currently fails...
  @Test
  public void testInvalidArgumentValueFormat() throws Exception {
    Args args = new Args("x,y", new String[]{"xy", "true", "false"});
    assertEquals(false, args.isValid());
  }
}