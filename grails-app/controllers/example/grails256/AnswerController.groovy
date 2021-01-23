package example.grails256

class AnswerController {

    def index() { }


    def doSomething() {
        flash.message = message(code: "question.mymessage", default: "Job done")
        redirect(controller: "home")
    }
}
