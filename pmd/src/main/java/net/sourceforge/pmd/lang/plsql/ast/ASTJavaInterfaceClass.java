/* Generated By:JJTree: Do not edit this line. ASTJavaInterfaceClass.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=net.sourceforge.pmd.lang.ast.AbstractNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTJavaInterfaceClass extends SimpleNode {
  public ASTJavaInterfaceClass(int id) {
    super(id);
  }

  public ASTJavaInterfaceClass(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b141b900f55986c52a733bd43bfe38a3 (do not edit this line) */