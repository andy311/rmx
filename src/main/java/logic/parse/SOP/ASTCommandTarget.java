/* Generated By:JJTree: Do not edit this line. ASTCommandTarget.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=BaseNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package logic.parse.SOP;

public
class ASTCommandTarget extends SimpleNode {
  public ASTCommandTarget(int id) {
    super(id);
  }

  public ASTCommandTarget(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d403727ce961b939a43cd1a15e5d65da (do not edit this line) */