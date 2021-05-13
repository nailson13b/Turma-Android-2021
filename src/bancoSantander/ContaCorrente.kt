package bancoSantander

open class ContaCorrente(
    override var numero: String,
    override var sobrenome: String,
    override var rg: String,
    override var cpf: String
): Conta(
    numero,
    sobrenome,
    rg,
    cpf
) {
    private var dataAtual :String = "12/05/2021"



    fun depositarCheque(
        valorCheque: Double,
        bancoEmissor:String,
        dataCheque: String
    ):String{
        return if(dataCheque == dataAtual){
            this.saldo =+ valorCheque
            "Você depositou R$$valorCheque e seu saldo atual é de R$${this.saldo}."
        }else{
            "O cheque ainda não foi reconhecido, consulte o seu banco emissor: $bancoEmissor."
        }

    }

}


