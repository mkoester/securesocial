package helpers

import java.util.concurrent.{ Executor, Executors }

class CurrentThreadExecutor extends Executor {
  def execute(r: Runnable) {
    r.run()
  }
}
