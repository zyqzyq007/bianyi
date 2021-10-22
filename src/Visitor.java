// Visitor.java
public class Visitor extends lab1BaseVisitor<Void> {
    @Override
    public Void visitCompUnit(lab1Parser.CompUnitContext ctx) {
        return super.visitCompUnit(ctx);
    }

    @Override
    public Void visitFuncDef(lab1Parser.FuncDefContext ctx) {
        System.out.print("define dso_local ");

        return super.visitFuncDef(ctx);
    }

    @Override
    public Void visitFuncType(lab1Parser.FuncTypeContext ctx) {
        if(ctx.FuncType_int()!=null){
            System.out.print("i32 ");
        }

        return super.visitFuncType(ctx);
    }

    @Override public Void visitIdent(lab1Parser.IdentContext ctx)  {
        if(ctx.Ident_main()!=null){
            System.out.print("@"+ctx.Ident_main().getText());
        }

        return super.visitIdent(ctx);
    }

    @Override public Void visitBlock(lab1Parser.BlockContext ctx) {
        System.out.print("()");
        System.out.println("{");
        visit(ctx.stmt());
        System.out.println("");
        System.out.print("}");
        return null;
    }

    @Override public Void visitStmt(lab1Parser.StmtContext ctx) {

        System.out.print("ret ");
        visit(ctx.number());
        return null;
    }

    @Override public Void visitNumber(lab1Parser.NumberContext ctx) {

        if(ctx.Octal_const()!=null){
            int a=Integer.parseInt(ctx.Octal_const().getText(),8);
            System.out.print(a);
        }else if(ctx.Decimal_const()!=null){
            System.out.print(ctx.Decimal_const().getText());
        }else if(ctx.Hexadecimal_const()!=null){
            int a=Integer.parseInt(ctx.Hexadecimal_const().getText().substring(2),16);
            System.out.print(a);
        }
        return null;
    }

}