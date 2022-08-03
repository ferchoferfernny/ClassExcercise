package State;

public interface Estado {


// estado donde la persona tarda mas de 2 dias en ejecutar un acción
abstract void Overtime();
// Estado donde la persona esta lista para pagar
abstract void Facturado();
//Estado donde la persona cancela con los botones la accion a realizar 
abstract void Cancelado();
}
