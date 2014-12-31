package scenarios

import play.api.test.{ Writeables, RouteInvokers, PlayRunners }

package object helpers {
  type ApiExecutor = PlayRunners with RouteInvokers with Writeables
}
