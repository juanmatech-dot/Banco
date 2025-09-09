public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
        this.saldo = 0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso: " + monto);
        } else {
            System.out.println("El monto a depositar debe ser mayor que 0.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro exitoso: " + monto);
            } else {
                System.out.println("Fondos insuficientes. Saldo actual: " + saldo);
            }
        } else {
            System.out.println("El monto a retirar debe ser mayor que 0.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo: " + cuenta.getSaldo()); // debe imprimir 300
    }
}
