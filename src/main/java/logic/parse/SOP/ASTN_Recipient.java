/* Generated By:JJTree: Do not edit this line. ASTN_Recipient.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=BaseNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package logic.parse.SOP;

public
class ASTN_Recipient extends SimpleNode {
  public ASTN_Recipient(int id) {
    super(id);
  }

  public ASTN_Recipient(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c2c2b39b9f9a221d198b4c3045e59e13 (do not edit this line) */
